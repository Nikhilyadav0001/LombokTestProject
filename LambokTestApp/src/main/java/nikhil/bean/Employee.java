package nikhil.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
public class Employee {

	@NonNull
	private Integer eid;
	@NonNull
	private String sname;
	@NonNull
	private String saddress;
	private Float esalary;
	
}
