package mappers;

import fr.mattkds.avro.event.V2.Order;

/**
 * Order Mapper to transform a version 1 event into a version 2 event
 */
public class OrderVersionMapper {

    public fr.mattkds.avro.event.V2.Order mapOrderV1toOrderV2(fr.mattkds.avro.event.v1.Order orderV1) {
        return new Order(
                orderV1.getOrderId(),
                orderV1.getStoreId(),
                (double) orderV1.getAmount(),
                orderV1.getCurrency(),
                orderV1.getArticle()
        );
    }

}
