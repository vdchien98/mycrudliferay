/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package crud.backend.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import crud.backend.exception.NoSuchUDException;
import crud.backend.model.CRUD;
import crud.backend.service.CRUDLocalService;
import crud.backend.service.base.CRUDLocalServiceBaseImpl;


/**
 * @author liferay
 */
@Component(
	property = "model.class.name=crud.backend.model.CRUD",
	service = AopService.class
)


//long crudId, String name, String email,String phone, String message,String department , ServiceContext serviceContext

public class CRUDLocalServiceImpl extends CRUDLocalServiceBaseImpl {
       public CRUD addCRUD(String name, String department, String phone,String email, String message ,ServiceContext serviceContext) throws PortalException {  	   
    	   long crudId = counterLocalService.increment();
    	   CRUD crud = crudPersistence.create(crudId);
    	   crud.setUuid(serviceContext.getUuid());
    	   crud.setName(name);
	      crud.setDepartment(department);
	      crud.setPhone(phone);
	      crud.setEmail(email);
	      crud.setMessage(message);
          System.out.println("******* crudId la "+ crudId);
  
          crudPersistence.update(crud);	     
          return crud;
       }
      public CRUD updateCRUD (long crudId,String name, String department, String phone , String email, String message, ServiceContext serviceContext) throws PortalException,SystemException {
    	  CRUD crud = getCRUD(crudId);
    	  crud.setName(name);
	      crud.setDepartment(department);
	      crud.setPhone(phone);
	      crud.setEmail(email);
	      crud.setMessage(message);
	      crud.setExpandoBridgeAttributes(serviceContext);
	      System.out.println("******* upadte la "+ crudId);
	      crudPersistence.update(crud);
	      return crud;
      }
}