package lab15;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.http.Handler;

public class PersonController {

	private ObjectMapper objectMapper;
	private FileIO<List<Person>> io;

	public PersonController() {
		super();
		objectMapper = new ObjectMapper();
	}

	public Handler handleGetAllPersons = (context) -> {
		List<Person> pList = getAllPerosns();

		context.status(200);
		context.result(objectMapper.writeValueAsString(pList));
	};

	public Handler handleCreateNewPerson = (context) -> {
		Person person = objectMapper.readValue(context.body(), Person.class);
		createNewPerson(person);

		context.status(200);
		context.result(objectMapper.writeValueAsString(person));
	};

	public Handler handleUpdatePerson = (context) -> {
		Person person = objectMapper.readValue(context.body(), Person.class);
		updatePerson(person);

		context.status(200);
		context.result(objectMapper.writeValueAsString(person));
	};

	public Handler handleDeletePerson = (context) -> {
		Person person = objectMapper.readValue(context.body(), Person.class);
		deletePerson(person.getEmail());

		context.status(200);
		context.result(objectMapper.writeValueAsString(person));
	};

	public List<Person> getAllPerosns() {
		List<Person> pList = io.readObject();
		if (pList == null) {
			pList = new ArrayList<>();
		}
		return pList;
	}

	public void createNewPerson(Person person) {
		List<Person> pList = io.readObject();
		if (pList == null) {
			pList = new ArrayList<>();
		}

		pList.add(person);
		io.writeObject(pList);
	}

	public void updatePerson(Person person) {
		List<Person> pList = io.readObject();

		if (pList == null) {
			pList = new ArrayList<>();
		}

		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getEmail().equals(person.getEmail())) {
				pList.remove(i);
				pList.add(person);
				return;
			}
		}

	}

	public void deletePerson(String email) {
		List<Person> pList = io.readObject();

		if (pList == null) {
			pList = new ArrayList<>();
		}

		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getEmail().equals(email)) {
				pList.remove(i);
				return;
			}
		}

	}
}
