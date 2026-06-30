
// Description: Java 25 public DbIO interface for License.

/*
 *	server.markhome.mcf.CFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal 3.1 CFInt - Internet Essentials
 *	
 *	This file is part of Mark's Code Fractal CFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *	
 */

package server.markhome.mcf.v3_1.cfint.cfintpub;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;

/*
 *	CFIntPubLicenseTable public database interface for License has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFIntPubLicenseTable
{
	public static final String TABLE_NAME = "License";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ICFIntPubLicense createLicense( ICFSecPubAuthorization Authorization,
		ICFIntPubLicense rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ICFIntPubLicense updateLicense( ICFSecPubAuthorization Authorization,
		ICFIntPubLicense rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteLicense( ICFSecPubAuthorization Authorization,
		ICFIntPubLicense rec );
	/**
	 *	Delete the License instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteLicenseByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argTenantId );

	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByLicnTenantIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubLicenseByLicnTenantIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argTopDomainId );

	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByDomainIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubLicenseByDomainIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argTopDomainId,
		String argName );

	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByUNameIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubLicenseByUNameIdxKey argKey );


	/**
	 *	Read the derived License record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubLicense readDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived License record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubLicense lockDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all License instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ICFIntPubLicense[] readPubAllDerived( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the derived License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubLicense readDerivedByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFIntPubLicense[] readDerivedByLicnTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFIntPubLicense[] readDerivedByDomainIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TopDomainId );

	/**
	 *	Read the derived License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubLicense readDerivedByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Read the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense readRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense lockRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific License record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific License instances in the database accessible for the Authorization.
	 */
	ICFIntPubLicense[] readAllRec( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the specific License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense readRecByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense[] readRecByLicnTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense[] readRecByDomainIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TopDomainId );

	/**
	 *	Read the specific License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubLicense readRecByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TopDomainId,
		String Name );
}
