package com.example.service.fallback

import com.example.Service2Client
import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

@Fallback
class Service2ClientFallbackService implements Service2Client{
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        println "cool"
        Book book = new Book(title: "service2", author: "is", isbn: "down")
        Flowable.just([book])
    }
}
