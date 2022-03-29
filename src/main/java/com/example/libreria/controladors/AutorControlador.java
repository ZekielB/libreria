package com.example.libreria.controladors;


import com.example.libreria.Entidades.Autor;
import com.example.libreria.Servicios.AutorServicio;
import com.example.libreria.errores.ErrorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorControlador {

private AutorServicio autorServicio;

@Autowired
public AutorControlador(AutorServicio autorServicio){
    this.autorServicio = autorServicio;

}

@GetMapping
public String listarAutores(ModelMap model) {

    List<Autor> autores = autorServicio.listarTodos();

    model.addAttribute("autores",autores);

return "autores/lista-autores";
}

@GetMapping("/formulario")
public String mostrarFormulario(ModelMap model){

    model.addAttribute("autor", new Autor() );

return "autores/form-autores";
   }

 @PostMapping("/formulario")
   public String processForm(@ModelAttribute Autor autor,ModelMap model)  {

    autorServicio.saveAutor(autor);
       List<Autor> autores = autorServicio.listarTodos();

       model.addAttribute("autores",autores);


return "autores/lista-autores";
 }

 /*   @GetMapping("/autores/baja/{id}")
    public String baja(@PathVariable Autor autor) {


            autorServicio.baja(autor);
            return "/autores";

        }*/

    }











//metodo que busque todos los autores en el servicios
//incluir todos los autores en la vista (a traves de modelmap)
//plantilla que muestre los autores


