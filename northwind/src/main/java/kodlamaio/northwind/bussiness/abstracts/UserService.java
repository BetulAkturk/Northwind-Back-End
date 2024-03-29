package kodlamaio.northwind.bussiness.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilites.results.DataResult;
import kodlamaio.northwind.core.utilites.results.Result;



public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
