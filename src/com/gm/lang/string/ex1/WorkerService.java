package com.gm.lang.string.ex1;

public class WorkerService {
	
	//private String info;
	private StringBuffer sb;
	
	// 기본 생성자
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("A-인사과-과장-01012341234");
		sb.append(", B-IT-대리-01056785678");
		sb.append(", C-영업-부장-01099999999");
		sb.append(", D-마케팅-사원-01000000000");
	}
	
	
	// 메서드
	public WorkerDTO[] init() {
		// info 파싱해서 WorkerDTO에 대입하고
		// WorkerDTO를 모은 배열을 리턴
		
		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		String[] infos = newInfo.split("-");
		
		WorkerDTO[] workerDTOs = new WorkerDTO[infos.length/4];
		
		System.out.println(infos.length);
		
		for(int i = 0; i < infos.length; i++) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTOs[i/4] = workerDTO;
			workerDTO.setName(infos[i].trim()); // 4, 8
			workerDTO.setDepartment(infos[++i].trim()); // 5, 9
			workerDTO.setJob(infos[++i].trim()); // 6, 10
			workerDTO.setPhone(infos[++i].trim());// 7, 11
			
		}
		
//		System.out.println(workerDTO.getName());
//		System.out.println(workerDTO.getDepartment());
//		System.out.println(workerDTO.getJob());
//		System.out.println(workerDTO.getPhone());
		
		return workerDTOs;
	}
	

}
