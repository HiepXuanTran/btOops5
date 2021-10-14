import java.util.List;
import java.util.Scanner;

import Dto.Worker;
import Service.WorkerService;
import Service.WorkerServiceInterface;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		WorkerServiceInterface service = new WorkerService();
		List<Worker> worker=service.Insert(sc);
		System.out.println("List : ");
		service.Show(worker);
		service.Delete(worker, sc);
		System.out.println("List sau khi xoa: ");
		service.Show(worker);
		service.SearchT(worker, sc);
		service.SortT(worker);
		System.out.println("List con lai sau khi xoa da sap xep: ");
		service.Show(worker);
	}
}
