package io.hopenberg.apps.adapter;

import io.hopenberg.apps.model.Project;
import io.hopenberg.apps.model.ProjectRepository;
import io.hopenberg.apps.model.TaskGroup;
import io.hopenberg.apps.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("select distinct p from Project p join fetch p.steps")
    List<Project> findAll();
}
