package org.project.oikos.repositories;

import java.util.List;

import org.project.oikos.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	Profile findByAlias(String alias);
	List<Profile> findByNameContainingIgnoreCase(String name);

}
