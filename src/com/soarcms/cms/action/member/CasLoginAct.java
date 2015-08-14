package com.soarcms.cms.action.member;

import static com.soarcms.cms.Constants.TPLDIR_MEMBER;
import static org.apache.shiro.web.filter.authc.FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.soarcms.core.entity.CmsSite;
import com.soarcms.core.web.util.CmsUtils;
import com.soarcms.core.web.util.FrontUtils;

@Controller
public class CasLoginAct {
	public static final String COOKIE_ERROR_REMAINING = "_error_remaining";
	public static final String LOGIN_INPUT = "tpl.loginInput";
	public static final String LOGIN_STATUS = "tpl.loginStatus";
	public static final String TPL_INDEX = "tpl.index";

	/**
	 * 首页头部跳转到登陆页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login.jspx", method = RequestMethod.GET)
	public String input(HttpServletRequest request, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		String sol = site.getSolutionPath();
		model.addAttribute("site",site);
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath(request, sol, TPLDIR_MEMBER, LOGIN_INPUT);
	}

	@RequestMapping(value = "/login.jspx", method = RequestMethod.POST)
	public String submit(HttpServletRequest request,ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		String sol = site.getSolutionPath();
		Object error = request.getAttribute(DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (error != null) {
			model.addAttribute("error",error);
		}
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath(request, sol, TPLDIR_MEMBER, LOGIN_INPUT);
	}
}
