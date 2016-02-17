/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisfirehose.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * S3DestinationConfigurationMarshaller
 */
public class S3DestinationConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(S3DestinationConfiguration s3DestinationConfiguration,
            JSONWriter jsonWriter) {
        if (s3DestinationConfiguration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (s3DestinationConfiguration.getRoleARN() != null) {
                jsonWriter.key("RoleARN").value(
                        s3DestinationConfiguration.getRoleARN());
            }

            if (s3DestinationConfiguration.getBucketARN() != null) {
                jsonWriter.key("BucketARN").value(
                        s3DestinationConfiguration.getBucketARN());
            }

            if (s3DestinationConfiguration.getPrefix() != null) {
                jsonWriter.key("Prefix").value(
                        s3DestinationConfiguration.getPrefix());
            }

            if (s3DestinationConfiguration.getBufferingHints() != null) {
                jsonWriter.key("BufferingHints");
                BufferingHintsJsonMarshaller.getInstance().marshall(
                        s3DestinationConfiguration.getBufferingHints(),
                        jsonWriter);
            }

            if (s3DestinationConfiguration.getCompressionFormat() != null) {
                jsonWriter.key("CompressionFormat").value(
                        s3DestinationConfiguration.getCompressionFormat());
            }

            if (s3DestinationConfiguration.getEncryptionConfiguration() != null) {
                jsonWriter.key("EncryptionConfiguration");
                EncryptionConfigurationJsonMarshaller
                        .getInstance()
                        .marshall(
                                s3DestinationConfiguration
                                        .getEncryptionConfiguration(),
                                jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DestinationConfigurationJsonMarshaller instance;

    public static S3DestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationConfigurationJsonMarshaller();
        return instance;
    }

}