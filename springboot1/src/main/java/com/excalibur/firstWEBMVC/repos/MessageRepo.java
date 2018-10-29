package com.excalibur.firstWEBMVC.repos;

import com.excalibur.firstWEBMVC.dao.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository <Message, Long> {
}
