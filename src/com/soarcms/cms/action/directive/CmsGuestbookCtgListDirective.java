package com.soarcms.cms.action.directive;

import static com.soarcms.cms.Constants.TPL_STYLE_LIST;
import static com.soarcms.cms.Constants.TPL_SUFFIX;
import static com.soarcms.common.web.Constants.UTF8;
import static com.soarcms.common.web.freemarker.DirectiveUtils.OUT_LIST;
import static com.soarcms.core.web.util.FrontUtils.PARAM_STYLE_LIST;
import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.soarcms.cms.entity.assist.CmsGuestbookCtg;
import com.soarcms.cms.manager.assist.CmsGuestbookCtgMng;
import com.soarcms.common.web.freemarker.DirectiveUtils;
import com.soarcms.common.web.freemarker.ParamsRequiredException;
import com.soarcms.common.web.freemarker.DirectiveUtils.InvokeType;
import com.soarcms.core.entity.CmsSite;
import com.soarcms.core.web.util.FrontUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 专题列表标签
 */
public class CmsGuestbookCtgListDirective implements TemplateDirectiveModel {
	/**
	 * 模板名称
	 */
	public static final String TPL_NAME = "geustbook_ctg_list";

	/**
	 * 输入参数，站点ID。
	 */
	public static final String PARAM_SITE_ID = "siteId";

	@SuppressWarnings("unchecked")
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		CmsSite site = FrontUtils.getSite(env);

		List<CmsGuestbookCtg> list = cmsGuestbookCtgMng
				.getList(getSiteId(params));
		
		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(
				params);
		paramWrap.put(OUT_LIST, DEFAULT_WRAPPER.wrap(list));
		Map<String, TemplateModel> origMap = DirectiveUtils
				.addParamsToVariable(env, paramWrap);
		InvokeType type = DirectiveUtils.getInvokeType(params);
		String listStyle = DirectiveUtils.getString(PARAM_STYLE_LIST, params);
		if (InvokeType.sysDefined == type) {
			if (StringUtils.isBlank(listStyle)) {
				throw new ParamsRequiredException(PARAM_STYLE_LIST);
			}
			env.include(TPL_STYLE_LIST + listStyle + TPL_SUFFIX, UTF8, true);
		} else if (InvokeType.userDefined == type) {
			if (StringUtils.isBlank(listStyle)) {
				throw new ParamsRequiredException(PARAM_STYLE_LIST);
			}
			FrontUtils.includeTpl(TPL_STYLE_LIST, site, env);
		} else if (InvokeType.custom == type) {
			FrontUtils.includeTpl(TPL_NAME, site, params, env);
		} else if (InvokeType.body == type) {
			body.render(env.getOut());
		} else {
			throw new RuntimeException("invoke type not handled: " + type);
		}
		DirectiveUtils.removeParamsFromVariable(env, paramWrap, origMap);
	}

	private Integer getSiteId(Map<String, TemplateModel> params)
			throws TemplateException {
		return DirectiveUtils.getInt(PARAM_SITE_ID, params);
	}

	@Autowired
	private CmsGuestbookCtgMng cmsGuestbookCtgMng;
}
