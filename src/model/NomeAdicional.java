package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NomeAdicional implements INome {

	@Override
	public List<String> getNomes() {
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("Marcos");
		nomes.add("Jonas");
		return nomes;
	}
}
