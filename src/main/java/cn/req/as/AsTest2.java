package cn.req.as;

import java.util.Arrays;

import org.junit.Test;

import com.tibco.as.space.Member.DistributionRole;
import com.tibco.as.space.MemberDef;
import com.tibco.as.space.Metaspace;
import com.tibco.as.space.Space;
import com.tibco.as.space.SpaceResultList;
import com.tibco.as.space.Tuple;
import com.tibco.as.space.browser.Browser;
import com.tibco.as.space.browser.BrowserDef;
import com.tibco.as.space.browser.BrowserDef.BrowserType;
import com.tibco.as.space.browser.BrowserDef.DistributionScope;
import com.tibco.as.space.browser.BrowserDef.TimeScope;
import com.tibco.as.space.impl.data.ASSpaceResult;

public class AsTest2 {

	public void test() throws Exception {

		MemberDef memberDef = MemberDef.create("kitty2",
				"tcp://localhost:5000", "tcp://localhost:5003");

		// Database
		Metaspace ms = Metaspace.connect("testms", memberDef);

		// Join Space
		Space testSpace1 = ms.getSpace("TestSpace1", DistributionRole.SEEDER);

		// Record
		Tuple t = Tuple.create();
		t.put("id", "13208312-3df3-4c1d-a39c-0b8e04b374cc");

		// Delete
		testSpace1.take(t);
	}

	@Test
	public void testQuery() throws Exception {

		MemberDef memberDef = MemberDef.create("kitty2",
				"tcp://localhost:5000", "tcp://localhost:5003");

		// Database
		Metaspace ms = Metaspace.connect("testms", memberDef);

		// Join Space
		Space testSpace1 = ms.getSpace("TestSpace1", DistributionRole.SEEDER);

		Tuple world = Tuple.create();
		world.put("id", "8737e707-40de-41aa-bf55-5511083c4875");

		// Get
		world = testSpace1.get(world);

		// Assert.assertEquals("kitty", kitty.get("name"));

		Tuple hello = Tuple.create();
		hello.put("id", "6ff8cf7c-7da9-41eb-a041-f509baea1cd2");

		// Get All
		SpaceResultList resultList = testSpace1.getAll(Arrays.asList(world,
				hello));

		for (Object o : resultList) {
			ASSpaceResult sr = (ASSpaceResult) o;
			Tuple t = sr.getTuple();
			System.out.println(t.get("name"));
		}

		// Browse
		Browser browser = testSpace1.browse(BrowserType.GET, BrowserDef
				.create().setDistributionScope(DistributionScope.ALL)
				.setTimeScope(TimeScope.SNAPSHOT), "name=\"hello\"");

		Tuple tuple = browser.next();
		System.out.println("-----browser-------" + tuple.get("id"));
	}
}
