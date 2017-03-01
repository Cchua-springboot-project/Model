package com.ssm.strategy;

public class SecurityHandler {
/*	@Component
	public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	    @Override
	    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
						AuthenticationException exception) throws IOException, ServletException {
	 	userMapper.incrementFailedLogin(request.getParameter("sec-user"));
	
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getWriter().print("{\"success\": false}");
		response.getWriter().flush();
	    }
	}

	

	@Component
	public class AuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	    @Override
	    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
						Authentication authentication) throws ServletException, IOException {
		userMapper.updateUserOnAuthSuccess(request.getParameter("sec-user"));
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().print("{\"success\": true}");
		response.getWriter().flush();
	    }
	}


*/

}
