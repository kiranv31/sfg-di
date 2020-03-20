package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

	private final PetService petService;

	public PetController(final PetService service) {
		this.petService = service;
	}

	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
