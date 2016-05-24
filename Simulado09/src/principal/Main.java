package principal;

import entities.Cliente;
import persistence.DAOCliente;

public class Main {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		DAOCliente d = new DAOCliente();
		
		
		c.setNome("Rafael");
		c.setEmail("rafael@hiro.com");
		
		
		//INSERT
		try {
			d.insert(c);
			System.out.println("Cliente inserido com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//UPDATE -- FOI MODIFICADO para poder dar UPDATE pela MAIN

		try {
			d.update(2, "Babara", "babara@baba.com");
			System.out.println("Cliente modificado com sucesso!");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//DELETE
		try {
			d.delete(1);
			System.out.println("Cleinte deletado com sucesso");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FINDALL
		
		try {
			System.out.println(d.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FINDBYID
		try {
			System.out.println(d.findById(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}

}
