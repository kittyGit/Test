package cn.req.as;

import java.util.UUID;

import org.junit.Test;

import com.tibco.as.space.Member.DistributionRole;
import com.tibco.as.space.MemberDef;
import com.tibco.as.space.Metaspace;
import com.tibco.as.space.Space;
import com.tibco.as.space.Tuple;

public class AsTest {

	@Test
	public void test() throws Exception {

		MemberDef memberDef = MemberDef.create("kitty", "tcp://localhost:5000",
				"tcp://localhost:5002");

		// Database
		Metaspace ms = Metaspace.connect("testms", memberDef);

		// Table
		// SpaceDef spaceDef = SpaceDef.create("TestSpace1");
		// spaceDef.putFieldDef(FieldDef.create("id", FieldType.STRING));
		// spaceDef.putFieldDef(FieldDef.create("name", FieldType.STRING));
		// spaceDef.setKey("id");
		//
		// ms.defineSpace(spaceDef);

		// Join Space
		Space testSpace1 = ms.getSpace("TestSpace1", DistributionRole.SEEDER);

		// Record
		Tuple t = Tuple.create();
		t.put("id", UUID.randomUUID().toString());
		t.put("name", "logan");

		Tuple t2 = Tuple.create();
		t2.put("id", UUID.randomUUID().toString());
		t2.put("name", "hello");

		Tuple t3 = Tuple.create();
		t3.put("id", UUID.randomUUID().toString());
		t3.put("name", "world");

		Tuple t4 = Tuple.create();
		t4.put("id", UUID.randomUUID().toString());
		t4.put("name", "kitty");

		// Add
		testSpace1.put(t);
		testSpace1.put(t2);
		testSpace1.put(t3);
		testSpace1.put(t4);
		while (true) {

		}
	}
}
