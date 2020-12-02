package solution;

public class UserService {
	 public UserDAO dao;

     public UserService()
     {
         dao = new UserDAO();
     }

     // Excecao muito generica e nao eh runtime exception
     public void Create(User user) throws Exception
     {
         // metodo de UC ou servico com inicializacao (dependencia deve ser injetada)
         this.dao = new UserDAO();

        // Buscando para criar?
         user = this.dao.getUserByEmail(user.email);

         this.dao.createUser(user);
     }
}
