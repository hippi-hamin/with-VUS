package kr.co.icia.vrp.semi.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kr.co.icia.vrp.semi.dao.NodeDao;
import kr.co.icia.vrp.semi.entity.Node;
import kr.co.icia.vrp.semi.service.base.BaseService;
@Transactional(readOnly = true) //트랜잭션 단위 설정. 이 클래스의 메서드 단위로 DB 트랜잭션이 설정 됨.
@Service //서비스 레이어 빈으로 등
public class NodeService extends BaseService<Node, Long, NodeDao> {
}
