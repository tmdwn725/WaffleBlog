package semi.main.service.impl;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import semi.main.bean.MainVO;
import semi.main.dao.MainDAO;
import semi.main.service.MainService;
import semi.main.service.impl.IMainService;


@Service(value="mainService")
public class IMainService implements MainService
{
	
	@Inject
	MainDAO mainDAO;
	
	public MainVO Test() throws Exception
	{
		return mainDAO.selectTest();
	}
}