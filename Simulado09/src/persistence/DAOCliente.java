package persistence;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;

public class DAOCliente extends DAO{
	
	public void insert(Cliente c) throws Exception{
		
		String query = "insert into cliente(nome, email) values(?, ?)";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.execute();
		stmt.close();
		
		closeConnection();
		
	}
	
	public void update(Integer idCliente, String nome, String email) throws Exception{
		
		String query = "update cliente set nome = ?, email = ? where idcliente =?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, nome);
		stmt.setString(2, email);
		stmt.setInt(3, idCliente);
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}

	public void delete(Integer idCliente) throws Exception{
		
		String query = "delete from cliente where idcliente =?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idCliente);
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	public List<Cliente> findAll() throws Exception{
		
		String query = "select * from cliente order by idcliente asc";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		while(rs.next()){
			Cliente c = new Cliente();
			c.setIdCliente(rs.getInt("idcliente"));
			c.setNome(rs.getString("nome"));
			c.setEmail(rs.getString("email"));
			
			lista.add(c);
		}
		
		closeConnection();
		return lista;
		
	}
	
	public Cliente findById(Integer idCliente) throws Exception{

		String query = "select * from cliente where idcliente =?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idCliente);
		rs = stmt.executeQuery();
		
		Cliente c = null;
		
		if(rs.next()){
			c = new Cliente();
			c.setIdCliente(rs.getInt("idcliente"));
			c.setNome(rs.getString("nome"));
			c.setEmail(rs.getString("email"));
		}
		stmt.close();
		closeConnection();
		
		return c;
	}
	
}
