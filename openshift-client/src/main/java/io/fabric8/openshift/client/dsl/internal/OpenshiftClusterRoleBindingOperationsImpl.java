/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client.dsl.internal;

import io.fabric8.kubernetes.client.dsl.Resource;
import okhttp3.OkHttpClient;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBinding;
import io.fabric8.openshift.api.model.OpenshiftClusterRoleBindingList;
import io.fabric8.openshift.api.model.DoneableOpenshiftClusterRoleBinding;
import io.fabric8.openshift.client.OpenShiftConfig;

import java.util.Map;
import java.util.TreeMap;

import static io.fabric8.openshift.client.OpenShiftAPIGroups.AUTHORIZATION;

public class OpenshiftClusterRoleBindingOperationsImpl extends OpenShiftOperation<OpenshiftClusterRoleBinding, OpenshiftClusterRoleBindingList, DoneableOpenshiftClusterRoleBinding, Resource<OpenshiftClusterRoleBinding, DoneableOpenshiftClusterRoleBinding>> {
  public OpenshiftClusterRoleBindingOperationsImpl(OkHttpClient client, OpenShiftConfig config, String namespace) {
    this(client, config, AUTHORIZATION, null, namespace, null, true, null, null, false, -1, new TreeMap<String, String>(), new TreeMap<String, String>(), new TreeMap<String, String[]>(), new TreeMap<String, String[]>(), new TreeMap<String, String>());
  }

  public OpenshiftClusterRoleBindingOperationsImpl(OkHttpClient client, OpenShiftConfig config, String apiGroup, String apiVersion, String namespace, String name, Boolean cascading, OpenshiftClusterRoleBinding item, String resourceVersion, Boolean reloadingFromServer, long gracePeriodSeconds, Map<String, String> labels, Map<String, String> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields) {
    super(client, OpenShiftOperation.withApiGroup(client, apiGroup, apiVersion, config), "clusterrolebindings", namespace, name, cascading, item, resourceVersion, reloadingFromServer, gracePeriodSeconds, labels, labelsNot, labelsIn, labelsNotIn, fields);
  }
}
