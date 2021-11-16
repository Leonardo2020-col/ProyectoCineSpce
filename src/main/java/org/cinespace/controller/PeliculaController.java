package org.cinespace.controller;

import org.cinespace.model.Pelicula;
import org.cinespace.model.Usuario;
import org.cinespace.repository.IPeliculaRepository;
import org.cinespace.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class PeliculaController {
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("pelicula", new Pelicula());
		return "registrar";
	}

	
	@PostMapping("/login")
	public String grabarPag(@ModelAttribute Usuario usuario ) {
		repousu.save(usuario);
		System.out.println(usuario);

		return "index";
	}
	
	@GetMapping("/cargarLogin")
	public String cargarlogin(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "index";
	}
	
	@Autowired
	private IPeliculaRepository repopeli;
	
	@Autowired
	private IUsuarioRepository repousu;
	
	
	@GetMapping("/userForm")
	public String userForm() {
		return "user-form";
	}
	
	@GetMapping("/menubar")
	public String menubar() {
		return "menu-bar";
	}
	
	@GetMapping("/listar")
	public String listadoBus(Model model) {
		model.addAttribute("lstPeli", repopeli.findAll());
		return "consulta-pareja";
	}
	
	@PostMapping("/editar")
	public String buscarBus(@ModelAttribute Pelicula p, Model model ) {
		System.out.println(p);
		model.addAttribute("bus", repopeli.findById(p.getCodigo()));
		return "mantenimiento";
	}
	
}
