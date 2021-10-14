package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Dto.Worker;


public class WorkerService implements WorkerServiceInterface {

	@Override
	public List<Worker> Insert(Scanner sc) {
		int n;
		List<Worker> worker = new ArrayList<>();
		System.out.println("Nhap so cong nhan");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Worker workers = new Worker();
			System.out.println("nhap cong nhan thu "+(i+1)+" :");
			workers.nhap(sc);
			worker.add(workers);
		}
		return worker;
	}
	@Override
	public void Show(List<Worker> worker) {
		worker.forEach(Worker::xuat);	
	}

	@Override
	public void Delete(List<Worker> worker, Scanner sc) {
		sc.nextLine();
		System.out.println("Nhap ten can xoa: ");
		String name= sc.nextLine();
		Worker workers =worker.stream().filter(wk->wk.getName().compareToIgnoreCase(name)==0)
				.findFirst().orElse(null);
		if(workers==null) {
			System.out.println("Khong tim thay ten.");
			return;
		}
		worker.remove(workers);
		System.out.println("Xoa xong!");
	}
	@Override
	public void SearchT(List<Worker> worker, Scanner sc) {
		System.out.println("Nhap ten can tim: ");
		String name1= sc.nextLine();
		System.out.println("List ten can tim");
		for(Worker workers : worker) {
			if(workers.getName().compareToIgnoreCase(name1)==0){
				workers.xuat();
			}
		}
	}
	@Override
	public void SortT(List<Worker> worker) {
		Collections.sort(worker, new Comparator<Worker>() {
			@Override
            public int compare(Worker t, Worker t1) {
                return t.getName().compareToIgnoreCase(t1.getName());
            }
		});
	}
	

}
