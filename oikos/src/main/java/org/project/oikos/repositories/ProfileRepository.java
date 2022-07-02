package org.project.oikos.repositories;

import java.util.List;
import java.util.Optional;

import org.project.oikos.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	Optional<Profile> findById(long id);
	Optional<Profile> findByAlias(String alias);
	Optional<List<Profile>> findByNameContainingIgnoreCase(String name);
	Optional<Profile> findByAliasOrEmailIgnoreCase(String alias, String email);
}
