package com.yash.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	private ObjectId id;
	private String body;
	private LocalDateTime created;
	private LocalDateTime updated;

	public Reviews(String body, LocalDateTime created, LocalDateTime updated) {
		this.body = body;
		this.created = created;
		this.updated = updated;
	}
}