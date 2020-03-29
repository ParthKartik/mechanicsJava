package com.tyss.assetmanagement1.service;

import java.util.List;

import com.tyss.assetmanagement1.beans.Assets;
import com.tyss.assetmanagement1.beans.RequestForm;
import com.tyss.assetmanagement1.beans.UserDetails;
import com.tyss.assetmanagement1.util.exceptions.AssetNotFoundException;
import com.tyss.assetmanagement1.util.exceptions.InvalidPasswordException;
import com.tyss.assetmanagement1.util.exceptions.InvalidUsernameException;
import com.tyss.assetmanagement1.util.exceptions.QuantityNotAvailableException;
import com.tyss.assetmanagement1.util.exceptions.RequestNotFoundException;

public interface Service {
	
	UserDetails getUser(String userName, String password) throws InvalidPasswordException;
	List<UserDetails> getUsers();
	List<Assets> getAssets();
	List<RequestForm> getRequests();
	Assets getAsset(Integer assetID);
	RequestForm getRequest(Integer requestID);
	void addUser(UserDetails userDetails) throws InvalidUsernameException;
	void addAsset(Assets asset);
	void updateAsset(Integer assetID, Integer quantity) throws AssetNotFoundException;
	Integer addRequest(Integer empID, Integer managerID, Integer assetID, Integer quantity
			, String addNotes) throws AssetNotFoundException ;
	boolean allot(Integer requestID) throws QuantityNotAvailableException, RequestNotFoundException, AssetNotFoundException;
	void changePassword(Integer userID, String password) throws InvalidPasswordException;
}
