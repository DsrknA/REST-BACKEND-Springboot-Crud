package com.ilyas.dessar.backend.repositories;

import com.ilyas.dessar.backend.models.MasterProduk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository<MasterProduk, Long> {
}

