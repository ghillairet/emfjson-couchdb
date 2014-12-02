package org.emfjson.couchemf.suite;

import org.emfjson.couchemf.tests.ClientTest;
import org.emfjson.couchemf.tests.LoadDocumentTest;
import org.emfjson.couchemf.tests.StoreDocumentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ClientTest.class,
	LoadDocumentTest.class,
	StoreDocumentTest.class
})
public class CouchTestSuite {}