package shelmma.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import shelmma.db_driven_adapter.domain.UserEntity;

public interface HAAJpaUserRepository extends JpaRepository<UserEntity, Long>{}

