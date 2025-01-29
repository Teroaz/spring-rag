package net.efrei.springrag.repository;

import net.efrei.springrag.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("SELECT DISTINCT NEW net.efrei.springrag.service.dto.Document(d.id, d.title) FROM Document d")
    List<Document> findAllDocuments();

}