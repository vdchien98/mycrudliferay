package crud_web.portlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import crud.backend.model.CRUD;
import crud.backend.service.CRUDLocalService;
import crud_web.portlet.constants.CRUDPortletKeys;

/**
 * @author User
 */
@Component(
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=category.social",
			"com.liferay.portlet.header-portlet-css=/css/main.css",
			"com.liferay.portlet.instanceable=false",
	        "com.liferay.portlet.scopeable=true",
			"javax.portlet.display-name=CRUD",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.name=" + CRUDPortletKeys.CRUD,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			 "javax.portlet.supports.mime-type=text/html"
		},
		service = Portlet.class
	)
public class CRUDPortlet extends MVCPortlet {
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(CRUD.class.getName(), request);
		String name = ParamUtil.getString(request, "name");
		String department = ParamUtil.getString(request, "department");
		String phone = ParamUtil.getString(request, "phone");
		String email = ParamUtil.getString(request, "email");
		String message = ParamUtil.getString(request, "message");
		long crudId = ParamUtil.getLong(request, "crudId");
		System.out.println("xin chao " );
		if(crudId > 0) {
			
			_entryLocalService.updateCRUD(crudId,name, department, phone, email, message, serviceContext);

		            SessionMessages.add(request, "entryAdded");

//		            response.setRenderParameter(
//		                "guestbookId", Long.toString(guestbookId));

		
		}else {
			_entryLocalService.addCRUD(name, department, phone, email, message, serviceContext);
			SessionMessages.add(request, "entryAdded");
		}
		

	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	        throws IOException, PortletException { 

	        super.render(renderRequest, renderResponse);
	}
	@Reference(unbind = "-")
	protected void setEntryService(CRUDLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}

	private CRUDLocalService _entryLocalService;

}