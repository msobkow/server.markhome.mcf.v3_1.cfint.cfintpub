
// Description: Java 25 public DbIO interface for MajorVersion.

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
 *	CFIntPubMajorVersionTable public database interface for MajorVersion has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFIntPubMajorVersionTable
{
	public static final String TABLE_NAME = "MajorVersion";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ICFIntPubMajorVersion createMajorVersion( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersion rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ICFIntPubMajorVersion updateMajorVersion( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersion rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteMajorVersion( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersion rec );
	/**
	 *	Delete the MajorVersion instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteMajorVersionByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argTenantId );

	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMajorVersionByTenantIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersionByTenantIdxKey argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionBySubProjectIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argSubProjectId );

	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMajorVersionBySubProjectIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersionBySubProjectIdxKey argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argSubProjectId,
		String argName );

	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMajorVersionByNameIdx( ICFSecPubAuthorization Authorization,
		ICFIntPubMajorVersionByNameIdxKey argKey );


	/**
	 *	Read the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubMajorVersion readDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubMajorVersion lockDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all MajorVersion instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ICFIntPubMajorVersion[] readPubAllDerived( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubMajorVersion readDerivedByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFIntPubMajorVersion[] readDerivedByTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFIntPubMajorVersion[] readDerivedBySubProjectIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 SubProjectId );

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFIntPubMajorVersion readDerivedByNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Read the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion readRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion lockRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific MajorVersion record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MajorVersion instances in the database accessible for the Authorization.
	 */
	ICFIntPubMajorVersion[] readAllRec( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the specific MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion readRecByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion[] readRecByTenantIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion[] readRecBySubProjectIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 SubProjectId );

	/**
	 *	Read the specific MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFIntPubMajorVersion readRecByNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 SubProjectId,
		String Name );
}
