package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa a1 = new Pessoa("Rafael", "12323");
		Pessoa a2 = new Pessoa("Barbara" , "32215123");
		Pessoa a3 = new Pessoa("Samuel" , "1546546");
		Pessoa a4 = new Pessoa("Gabriel" , "87687683");
		Pessoa a5 = new Pessoa("ElElEl" , "12978979");
		
		
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		
		for(Pessoa a : lista){
			System.out.println("Pessoa......:" + a);
		}
		
		HashMap<Integer, Pessoa> lista2 = new HashMap<Integer, Pessoa>();
		
		lista2.put(1, new Pessoa("Rafael", "12321321"));
		lista2.put(2, new Pessoa("Barbara" , "32215123"));
		lista2.put(3,  new Pessoa("Samuel" , "1546546"));
		lista2.put(4, new Pessoa("Carlos", "999999999"));
		lista2.put(5, new Pessoa("Sono", "8888888"));
		
		for(Integer key : lista2.keySet()){
			Pessoa p = lista2.get(key);
			System.out.println(key + " = " + p);
		}
		
	}

}
