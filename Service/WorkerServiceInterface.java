package Service;

import java.util.List;
import java.util.Scanner;

import Dto.Worker;

public interface WorkerServiceInterface {
List<Worker> Insert(Scanner sc);
void Show(List<Worker> worker);
void Delete(List<Worker> worker, Scanner sc);
void SearchT(List<Worker> worker,Scanner sc);
void SortT(List<Worker> worker);

}
