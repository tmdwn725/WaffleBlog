package semi.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CommonInterceptor extends HandlerInterceptorAdapter{

	protected Log log = LogFactory.getLog(CommonInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		/*
		HttpSession session = request.getSession(); 
        // loginó���� ����ϴ� ����� ������ ��� �ִ� ��ü�� ������
        Object obj = session.getAttribute("login");
        
        if ( obj == null ){
            // �α����� �ȵǾ� �ִ� ���������� �α��� ������ �ٽ� ��������(redirect)
            response.sendRedirect("/login.do");
            return false; // ���̻� ��Ʈ�ѷ� ��û���� ���� �ʵ��� false�� ��ȯ��
        }
        */
		
		if(log.isDebugEnabled()) {
			log.debug("===================       START       ===================");
            log.debug("Request URI : " + request.getRequestURI());
		}
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (log.isDebugEnabled()) {
            log.debug("===================        END        ===================\n");
        }
		
		super.postHandle(request, response, handler, modelAndView);
	}
	

}
