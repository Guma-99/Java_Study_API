package com.gm.util.list;

import java.util.ArrayList;

import com.gm.lang.string.ex1.WorkerDTO;

public class ListMain3 {

	public static void main(String[] args) {
		WorkerDTO workerDTO = new WorkerDTO();
		WorkerDTO workerDTO2 = new WorkerDTO();
		ArrayList<WorkerDTO> ar = new ArrayList<>();
		ar.add(workerDTO);
		ar.add(workerDTO2);
		
		
		ArrayList al = new ArrayList();
		
		int n1 = (int) al.get(0);
		
		System.out.println(n1);
		
	}
}
