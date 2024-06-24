package com.coding.tek;

import java.util.*;
import java.util.stream.*;

import com.coding.entity.UsersData;

/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202411:16:43 am
 * @classDef com.coding
 */
public class StreamAPIStatement {

	static void printUserName(List<UsersData> userList) {
		userList.stream().filter(user->user.getUserId() != null).map(UsersData::getUserName).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<UsersData> userList = LongStream.range(0, 100).mapToObj(i->new UsersData(i,"User"+i,"User"+i+"@user.com")).toList();
		printUserName(userList);
	}

}
