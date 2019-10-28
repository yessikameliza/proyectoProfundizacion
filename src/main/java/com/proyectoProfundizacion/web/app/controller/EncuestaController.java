package com.proyectoProfundizacion.web.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectoProfundizacion.web.app.entity.Encuesta;
import com.proyectoProfundizacion.web.app.entity.Usuario;


@Controller
public class EncuestaController {

	/**
	 * Permite cargar el formulario de registro de usuario
	 * @param model
	 * @return  formulario usuario
	 */
	@GetMapping("/encuestaForm")
	public String EncuestaForm(Model model) {
		model.addAttribute("encuestaForm", new Encuesta());
		//model.addAttribute("usuarioList", UsuarioService.getAllUsers());
		model.addAttribute("listTab","active");
		return "encuesta/encuesta-view";
	}
	/**
     * Permite crear el usuario de acuerdo a los datos ingresado por 
     * el usuario
     * @param asig Entidad usuario
     * @param result 
     * @param model
     * @return formulario usuario
     */
	@PostMapping("/encuestaForm")
	public String createUsuario(@Valid @ModelAttribute("encuestaForm")Usuario asig, BindingResult result, ModelMap model) {
		//passwordEncoder = new BCryptPasswordEncoder();
		//asig.setPassword(passwordEncoder.encode(asig.getPassword()));
		//asig.setRole("ADMIN");
		if (result.hasErrors()) {
			model.addAttribute("encuestaForm", asig);
			model.addAttribute("formTab","active");
		}else {
		   try {
			//UsuarioService.createUsuario(asig);
			model.addAttribute("encuestaForm", new Encuesta());
			model.addAttribute("listTab","active");
		
		} catch (Exception e) {
			
			model.addAttribute("formErrorMessage",e.getMessage());
			model.addAttribute("userForm", asig);
			model.addAttribute("formTab","active");
			//model.addAttribute("usuarioList", UsuarioService.getAllUsers());
		
		}
		}
	    	//model.addAttribute("usuarioList", UsuarioService.getAllUsers());
	    	return "encuesta/encuesta-view";
	}
	
	/**
	 * Setea los datos del usuario que el usuario selecciona para editar
	 * @param model
	 * @param id variable para identificar el usuario seleccionado
	 * @return formuario usuario
	 * @throws Exception
	 */
	@GetMapping("/editEncuesta/{id}")
	public String getEditEncuestaForm(Model model, @PathVariable(name ="id")Long id)throws Exception{
		//Usuario asigToEdit = UsuarioService.getUsuarioById(id);

	//	model.addAttribute("usuarioForm", asigToEdit);
		//model.addAttribute("usuarioList", UsuarioService.getAllUsers());
		model.addAttribute("formTab","active");
		model.addAttribute("editMode","true");

		return "encuesta/encuesta-view";
	}
	
	 /**
     * Permite editar el usuario que el usuario seleccione
     * @param asig Entidad usuario
     * @param result
     * @param model
     * @return formulario usuario
     */
	@PostMapping("/editEncuesta")
	public String postEditEncuestaForm(@Valid @ModelAttribute("encuestaForm")Encuesta asig, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("encuestaForm", asig);
			model.addAttribute("formTab","active");
			model.addAttribute("editMode","true");
		}else {
			try {
			//	UsuarioService.updateUsuario(asig);
				model.addAttribute("encuestaForm", new Encuesta());
				model.addAttribute("listTab","active");
			} catch (Exception e) {
				model.addAttribute("formErrorMessage",e.getMessage());
				model.addAttribute("encuestaForm", asig);
				model.addAttribute("formTab","active");
				//model.addAttribute("usuarioList", UsuarioService.getAllUsers());
				model.addAttribute("editMode","true");
			}
		}

		//model.addAttribute("UsuarioList", UsuarioService.getAllUsers());
		return "encuesta/encuesta-view";

	}

	  /**
     * Permite cancelar el usuario que el usuario ha elegido para
     * editar
     * @param model
     * @return formulario usuario
     */
	@GetMapping("/editEncuesta/cancel")
	public String cancelEditEncuesta(ModelMap model) {
		return "redirect:/encuestaForm";
	}
	
	/**
     * permite eliminar el usuario seleccionada
     * @param model
     * @param id del usuario a eliminar
     * @return formulario usuario
     */
	@GetMapping("/deleteEncuesta/{id}")
	public String deleteEncuesta(Model model, @PathVariable(name="id") Long id) {
		try {
		//	UsuarioService.deleteUsuario(id);
		} catch (Exception e) {
			model.addAttribute("Error de eliminacion","El usuario no puede ser eliminado");
		}
		return EncuestaForm(model);
	}

}
