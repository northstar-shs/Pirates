package kr.co.spock.repository;

import org.springframework.data.jpa.repository.*;

import kr.co.spock.model.*;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
