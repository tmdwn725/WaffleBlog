package semi.main.service.impl;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semi.main.bean.MainVO;
import semi.main.dao.MainDAO;
import semi.main.service.MainService;
import semi.main.service.impl.MainServiceImpl;

@Service(value="mainService")
public class MainServiceImpl implements MainService
{
	
	@Autowired
	MainDAO mainDAO;
	
	public MainVO Test() throws Exception
	{
		return mainDAO.selectTest();
	}
}