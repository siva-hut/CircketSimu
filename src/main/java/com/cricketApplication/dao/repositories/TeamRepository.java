package com.cricketApplication.dao.repositories;

import com.cricketApplication.cricketGame.Team;
import com.cricketApplication.dao.entities.TeamDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<TeamDao, Long> {

    TeamDao findByName(String teamName);

    @Query(value = "SELECT team_Name From Team", nativeQuery = true)
    public List<String> findAllTeamName();

}
