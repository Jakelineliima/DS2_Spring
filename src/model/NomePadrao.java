package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

public class NomePadrao implements INome {

	@Override
	public List<String> getNomes() {
		List<String> nomes = new ArrayList<>();
		nomes.add("Josefina");
		nomes.add("Benedito");
		return nomes;
	}
}
