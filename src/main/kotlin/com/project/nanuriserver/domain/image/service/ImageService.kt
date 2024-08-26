package com.project.nanuriserver.domain.image.service

import com.microsoft.azure.storage.CloudStorageAccount
import com.microsoft.azure.storage.blob.CloudBlobClient
import com.microsoft.azure.storage.blob.CloudBlobContainer
import com.project.nanuriserver.global.common.config.image.ImageProperties
import org.springframework.stereotype.Service
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*


@Service
class ImageService(
    private val imageProperties: ImageProperties
) {

    fun uploadImage(fileName: String, fileBase64: String): String {
        val decoded = Base64.getDecoder().decode(fileBase64) // bytearray

        var blobClient: CloudBlobClient = CloudStorageAccount
            .parse(imageProperties.storageConnectionString).createCloudBlobClient()

        var container: CloudBlobContainer = blobClient.getContainerReference("nanuri")

        var path: Path = Paths.get("/${fileName}")

        val blob = container.getBlockBlobReference("nanuri/" + path.toFile().name)
        blob.properties.contentType = "image/png"

        blob.uploadFromByteArray(decoded, 0, decoded.size)

        return blob.uri.toString()

    }

}