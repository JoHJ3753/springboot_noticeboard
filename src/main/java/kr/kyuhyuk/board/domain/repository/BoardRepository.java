package kr.kyuhyuk.board.domain.repository;

import kr.kyuhyuk.board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}