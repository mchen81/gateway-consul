package com.example.service

import com.example.Service2Client
import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable


@Client(id = "service2")
@Recoverable(api = Service2Client.class)
interface BookService extends Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}
