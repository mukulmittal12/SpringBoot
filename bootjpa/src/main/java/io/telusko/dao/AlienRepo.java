package io.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.telusko.model.Alien;
/*We can also use JpaRepository which will also extend CrudRepository
 * The only difference is that Crud returns a String while Jpa returns List
*/
public interface AlienRepo extends CrudRepository<Alien, Integer> {
	List<Alien> findByTeam(String team);
	List<Alien> findByAidLessThan(int aid);
	
	@Query("from Alien where team=?1 order by aname")
	List<Alien> findByTeamSorted(String team);
}
