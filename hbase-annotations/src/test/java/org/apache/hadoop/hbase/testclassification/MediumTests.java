/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.testclassification;

/**
 * Tag a test as 'Medium', meaning that the test class has the following
 * characteristics:
 * <ul>
 *  <li>executed in an isolated JVM. Tests can however be executed in different JVM on the same
 *  machine simultaneously.</li>
 *  <li>will have to be executed by the developer before submitting a bug</li>
 *  <li>ideally, last less than 1 minutes to help parallelization</li>
 * </ul>
 *
 *  Use it for tests that cannot be tagged as 'Small'.
 *
 * @see SmallTests
 * @see LargeTests
 * @see IntegrationTests
 */
public interface MediumTests {
}
