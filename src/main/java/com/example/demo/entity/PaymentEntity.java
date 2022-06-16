package com.example.demo.entity;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Payment")
public class PaymentEntity {
	@Id
	private long paymentId;
	@Column(name="type")
	private String type;
	@Column(name="status")
	private String sataus;
//	@OneToMany
//	private Card card;
	@OneToOne
	private AppoinmentEntity appointment;
}
